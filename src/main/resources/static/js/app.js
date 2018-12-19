//左侧导航
$(function () {
    var oNav = $('.nav-sidebar li');

    for (var i=0;i<oNav.length;i++)
    {
        oNav[i].onclick = function()
        {
            for (var i=0;i<oNav.length;i++)
            {
                oNav[i].className="active1";
            }
            this.className="active";
        };
    };
});
//搜索
$(function () {

})