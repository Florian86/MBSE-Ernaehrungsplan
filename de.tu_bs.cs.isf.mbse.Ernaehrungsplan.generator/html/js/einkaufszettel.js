$("input[type=checkbox]").click(function() {
	//alert(getStatus());
	if($(this).is(':checked')) {
		$(this).parent().parent().addClass("success");
	} else {
		if ($(this).parent().parent().hasClass("success")) {
			$(this).parent().parent().removeClass("success");
		}
	}
});

