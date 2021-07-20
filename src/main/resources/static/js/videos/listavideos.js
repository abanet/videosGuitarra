
$(document).ready(function() {

    var table = $('#listaVideos').DataTable( {
        "fixedHeader" : true,
        "paging":   false,
        "info":     true,
        "autoWidth": true,
        "language": {
            url: '/data/datatableSpain.json'
        },
        "order": [],
        columns: [
            null,
            null,
            { orderable: false },
            null
        ]

        /*dom : '<if<rt>lp>'*/
    } );



    editor = new $.fn.dataTable.Editor( {
        ajax: "editor",
        table: "#listaVideos2",
        fields: [ {
            label: "Nombre:",
            name: "nombre"
        }, {
            label: "Descripción:",
            name: "descripcion"
        }, {
            label: "Codigo Youtube:",
            name: "codigoYoutube"
        }, {
            label: "BPM:",
            name: "bpm"
        }
        ]
    } );

    $.ajax({
        "url": "listado2",
        "type": "GET",
        "datatype": 'json',
        "success": function (data) {
            $('#listaVideos2').DataTable({
                "fixedHeader" : true,
                "paging":   false,
                "info":     true,
                "autoWidth": true,
                "language": {
                    url: '/data/datatableSpain.json'
                },
                "order": [],
                data: data,
                columns: [
                    { "data": "nombre" },
                    { "data": "descripcion" },
                    { "data": "codigoYoutube",
                        "title": "Youtube",
                        "orderable": false
                    },
                    { "data": "bpm" },
                ],
                buttons: [
                    { extend: "create", editor: editor },
                    { extend: "edit",   editor: editor },
                    { extend: "remove", editor: editor }
                ],
                dom: "Bfrtip",
            });
        }
    });

} );
