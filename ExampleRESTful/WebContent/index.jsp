<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>GlassFish JSP Page</title>
    	
    	<script type="text/javascript" src="js/jquery-1.9.1.min.js">&nbsp;</script>
    	
    	<script type="text/javascript">
    	function init() {
    		$("input").click( function() {
    			var type = this.value;
    			$.ajax({
    	    		  url: "/ExampleRESTful/resources/message/83",
    	    		  type: "GET",
    	    		  dataType: type,
    	    		  success : function(data, textStatus, jqXHR ) {
    	    			  alert(jqXHR.responseText);
    	    		  },
					  error: function () {
						  alert('Erro');
					  }    	    		 
    	    		  
    	    		});
    		});
    	}
    	
    	</script>
  </head>
  <body onload="init();">
    <h1>RESTFul!</h1>
    
    <input id="get_text" value="text" type="button" /><br />
    <input id="get_json" value="json" type="button" /><br />
    <input id="get_xml" value="xml"  type="button"/><br />
  </body>
</html> 
