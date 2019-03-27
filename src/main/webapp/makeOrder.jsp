<%-- 
    Document   : makeOrder
    Created on : 21-03-2019, 12:52:27
    Author     : Kasper Jeppesen
--%>
<jsp:include page='/jsp/sitemenu.jsp'></jsp:include>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript">
    
    function doorAndWindowValidate()
    {
        var length = Integer.Parseint(document.getElementById("length"));
        var height = Integer.Parseint(document.getElementById("height"));
        
        var checkboxDoor = document.getElementById("door");
        var checkboxWindow = document.getElementById("window");

        if(checkboxDoor.checked == true|| checkboxWindow.checked == true)
        {
            if(length< 8 || height< 4)
            {
                alert("The length need to be atleast 8 and the height atleast 4, in order to get a door or window");
                return false;
            }
        }
    }
    
</script>

<form onsubmit="return doorAndWindowValidate();" action="FrontController" method="get">
    <p>Enter the width of the house</p> 
    <input type="text" name="width"> <br>

    <p>Enter the length of the house</p> 
    <input type="text" name="length" id="length"> <br>
    
    <p>Enter the height of the house</p> 
    <input type="text" name="height" id="height"> <br>
    
    <p> check the boxes down below if you want a door or a window </p>
    <p> Please note that the length of the house need to be atleast 8, and the height of the house atleast 4, in order to get a door and a window</p> <br>
    
    <label for="door"> Door: </label>
    <input type="checkbox" name="door" id="door" > <br> <br>
    <label for="door"> Window: </label>
    <input type="checkbox" name="window" id="window"> <br> <br>

    <input type="submit" name="place order" >
    <input type="hidden" name="command" value="makeOrder">
</form>



