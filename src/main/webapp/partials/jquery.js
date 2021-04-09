$('h2').hover(
    function () {
        $(this).css({
            color: 'red',
            transition: '.5s'
        })
    },
    function () {
        $(this).css('color', 'black');
    }
);