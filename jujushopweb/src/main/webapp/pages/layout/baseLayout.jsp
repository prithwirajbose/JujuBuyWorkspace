<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<head>
<tiles:insertAttribute name="pageMeta" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="<%=request.getContextPath() %>/resources/css/style.css" rel="stylesheet" type="text/css" media="all"/>
<link href="<%=request.getContextPath() %>/resources/css/slider.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jquery-1.7.2.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/move-top.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/easing.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/startstop-slider.js"></script>
<tiles:insertAttribute name="pageSpecificJsInclude" />
</head>
<body>
  <div class="wrap">
	<div class="header">
		<div class="headertop_desc">
			<div class="call">
				 <p><span>Need help?</span> call us <span class="number">1-22-3456789</span></span></p>
			</div>
			<div class="account_desc">
				<tiles:insertAttribute name="topMenu" />
			</div>
			<div class="clear"></div>
		</div>
		<div class="header_top">
			<div class="logo">
				<a href="<%=request.getContextPath() %>/"><img src="<%=request.getContextPath() %>/resources/images/logo.png" alt="" /></a>
			</div>
			  <div class="cart">
			  	   <p>Welcome to our Online Store! <span>Cart:</span><div id="dd" class="wrapper-dropdown-2"> 0 item(s) - $0.00
			  	   	<ul class="dropdown">
							<li>you have no items in your Shopping cart</li>
					</ul></div></p>
			  </div>
			  <script type="text/javascript">
			function DropDown(el) {
				this.dd = el;
				this.initEvents();
			}
			DropDown.prototype = {
				initEvents : function() {
					var obj = this;

					obj.dd.on('click', function(event){
						$(this).toggleClass('active');
						event.stopPropagation();
					});	
				}
			}

			$(function() {

				var dd = new DropDown( $('#dd') );

				$(document).click(function() {
					// all dropdowns
					$('.wrapper-dropdown-2').removeClass('active');
				});

			});

		</script>
	 <div class="clear"></div>
  </div>
	<div class="header_bottom">
	     	<div class="menu">
	     		<tiles:insertAttribute name="mainMenu" />
	     	</div>
	     	<div class="search_box">
	     		<form>
	     			<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
	     		</form>
	     	</div>
	     	<div class="clear"></div>
	     </div>	     
	<tiles:insertAttribute name="headerSlide" />
   </div>
 <tiles:insertAttribute name="body" />
 </div>
</div>
   <tiles:insertAttribute name="footer" />
    <script type="text/javascript">
		$(document).ready(function() {			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
    <a href="#" id="toTop"><span id="toTopHover"> </span></a>
    <div id="globalPanels"></div><tiles:insertAttribute name="globalPanels" /></div>
    <div id="localPanels"><tiles:insertAttribute name="pageSpecificPanels" /></div>
    <tiles:insertAttribute name="pageSpecificBottomJs" />
</body>
</html>

