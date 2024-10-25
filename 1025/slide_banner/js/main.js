$(function(){
    var visual = $('#brandVisual > ul > li'); // 큰사진
    var button1 = $('#buttonList > li'); // 페이지버튼
    var current = 0; // 현재
    var id;

    button1.click(function(){
        var i = $(this).index();
        // alert(i);
        button1.removeClass('on');
        button1.eq(i).addClass('on');
        move(i); 
        });

    function timer(){
        id = setInterval(function(){
            var n = current + 1;
            if(n == 3){
                n = 0;
            }
            button1.eq(n).trigger('click'); //버튼1을 컴퓨터에게 3초마다 n에 값에 따라 클릭을 강제로 시킴
        },3000);
    }
    timer();

    function move(i){
        if(current==i) return;
        // 현재 활성화 된 button과 클릭 한 버튼이 같으면 빠져나감
        var cu = visual.eq(current);
        var ne = visual.eq(i);
        cu.css('left','0').stop().animate({'left':"-100%"},500);
        ne.css('left','100%').stop().animate({'left':"0%"},500);
        current = i;
    };
});