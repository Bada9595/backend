// $('.sub').hide();

// $('.m_menu>li>a').click(function(){
//     var i = $(this).next('.sub').css('display');
//     // alert(i);
//     if(i=='none'){
//         $('.sub').slideUp();
//         $(this).next('.sub').slideDown();
//     }else{
//         $('.sub').slideUp();
//     }
// });

$('.sub').hide();

$('.m_menu>li>a').click(function(){
    var i = $(this).next('.sub').css('display');
    if(i=='none'){
        $('.sub').slideUp();
        $(this).next('.sub').slideDown();
    }else{
        $('.sub').slideUp();
    }
});