 var app = angular.module('MyApp', [])
  app.controller('MyController', function ($scope,$http,$location) {
	  $scope.city="";
	  $scope.filters={}
	  
	  if(localStorage.getItem('places')==null)
	  $scope.place_list=[]
	  else
		  $scope.place_list=localStorage.getItem('places')
	  $scope.carColors = ["Black","Blue","Red","White"];

	  $scope.category_list=["hotel","restaurant","point of interest"];
	  
	  var cityName=localStorage.getItem("city_name")
	  if(cityName!="" && cityName!=null)
		  {
		  
		  $scope.city=cityName;
		  
		  
		  
		  }
	  console.log("city--",$scope.city)
	  
  
  
 
  	var city1="";
  	
  $( function() {
    var availableTags = [
      "Chennai,TamilNadu,India",
      "Banglore,karnataka,India",
      "Mumbai,Maharastra,India",
      "Delhi,India",
      "Ranchi,Jharkhand,India",
      "Coimbatore,TamilNadu,India",
      "Mysore,karnataka,India",
      "Manglore,karnataka,India",
      "Chandigarh,India",
      "Pune,Maharastra,India"
    ];
    
    $( "#tags" ).autocomplete({
      source: availableTags,
      select: function (e, ui) {
    	  setTimeout(function(){
          city1=$("#tags").val();
			console.log(city1)
			localStorage.setItem("city_name",city1);
			console.log($location.absUrl()+"/places")
			$http.get($location.absUrl()+"/places").then(
					
			function(response)
			{	console.log("yes")
				$scope.place_list=response.data.places;
				console.log(response.data.places)
				$scope.message=response.data.message
				$scope.city=city1
				localStorage.getItem('places',response.data.places)
			}
			
			,
			
			function(response)
			{alert("no")
				$scope.place_list=response.data.places;
				$scope.message=response.data.message
			}
			
			
			
			
			
			
			
			
			);
			
			
			
        
    	  },500);
      },
      change: function (e, ui) {
			
      }
      
    })
  } );
  
  
  $scope.clear=function()
  {
	  
	  
	  $scope.city='';localStorage.setItem('city_name','');$('#tags').val('')
	  
	  
  }
  
  
  
  window.reload=function()
  {
	  
  }
  
  });
     