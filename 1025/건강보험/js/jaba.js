$(function(){
var b_prev = $('.slideBtn p .prev');
var b_next = $('.slideBtn p .next');
var b_pause = $('.slideBtn p .pause');

var popCurrent = 0;
var popIndex = 0;
var total = $('.frame li').length
// alert(total);

b_next.click(function(){
    popIndex = popCurrent+1;
    if(popIndex == total) popIndex = 0;
    var pop_cu = $('.frame li').eq(popCurrent);
    var pop_ne = $('.frame li').eq(popIndex);
    pop_cu.css('left',0).stop().animate({'left':'-100%'});
    pop_ne.css('left','100%').stop().animate({'left':'0'});
    popCurrent = popIndex;
    $('.slideBtn p strong').text(popIndex+1);
});

b_prev.click(function(){
    popIndex = popCurrent-1;
    if(popIndex == -1) popIndex = total - 1;
    var pop_cu = $('.frame li').eq(popCurrent);
    var pop_ne = $('.frame li').eq(popIndex);
    pop_cu.css('left',0).stop().animate({'left':'100%'});
    pop_ne.css('left','-100%').stop().animate({'left':'0'});
    popCurrent = popIndex;
    $('.slideBtn p strong').text(popIndex+1);
});

var id;
id = setInterval(popAuto,3000);

function popAuto(){
    b_next.trigger('click');
}

b_pause.click(function(){
    if($(this).hasClass('on')==false){
        $(this).addClass('on');
        clearInterval(id);
    }else{
        $(this).removeClass('on');
        id = setInterval(popAuto,3000);
    }
});




});