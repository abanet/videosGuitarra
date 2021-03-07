
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


} );
