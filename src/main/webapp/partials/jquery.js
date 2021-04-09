var randomColor = '#' + Math.floor(Math.random() * 16777215).toString(16);

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