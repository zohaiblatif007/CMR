<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_Welcome to Persiviakatalonfont-familym_10c126</name>
   <tag></tag>
   <elementGuidId>637890a3-e999-4004-8bf6-3a167435584c</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*/text()[normalize-space(.)='']/parent::*</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>html.k-webkit.k-webkit87</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>k-webkit k-webkit87</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>



Welcome to Persivia!




















#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}

    
        




	


	
	
	
			



body
{
	overflow: auto;
}
.error{color: #ff0000;}
.navbar .nav>li>.dropdown-menu:after {
    right: 13px;
    left: auto;
}
.navbar .nav>li>.dropdown-menu:before {
    right: 12px;
    left: auto;
}
.dropdown-menu{
	margin-top: 8px !important;
}
.k-window-title {
 margin-top: 0px;   
}







    
   

	localStorage.removeItem('__persivia_session__');
	setTimeout(function(){
		localStorage.removeItem('__persivia_auth_updated');
	}, 600);
	var navBarHeight = 65;
	var signedIn = false; // global - replace with cookie or session data

	function getParameterByName(name) {
		var match = RegExp('[?&amp;]' + name + '=([^&amp;]*)').exec(
				window.location.search);
		return match &amp;&amp; decodeURIComponent(match[1].replace(/\+/g, ' '));
	}

	function displayTab(siteToShow) {
		if (!siteToShow) // if null
			return;

		if (siteToShow == 'careManagement')
			$('#cmTab').toggle();
		else if (siteToShow == 'dr')
			$('#drTab').toggle();
		else if (siteToShow == 'financials')
			$('#financialsTab').toggle();
		else if (siteToShow == 'css')
			$('#cssTab').toggle();
		else if (siteToShow == 'mm')
			$('#mmTab').toggle();
		else if (siteToShow == 'patient')
			$('#patientTab').toggle();
	}
	function pad(number, length) {
		   
	    var str = '' + number;
	    while (str.length &lt; length) {
	        str = '0' + str;
	    }
	   
	    return str;

	}
	
	function getDateTime(){
		var dt = new Date();
		// MM/dd/yyyy HH:mm
		var dtstring = pad(dt.getMonth()+1) + &quot;/&quot; + pad(dt.getDate()) + &quot;/&quot; + dt.getFullYear() + ' ' + pad(dt.getHours())+ ':' + pad(dt.getMinutes());
		
		return dtstring;
	}
	
	function DoSubmit(){	
		var password = document.fromLogin.userpwd.value
		document.fromLogin.userpwd.value = window.btoa(password)
			$(&quot;[name='clientdatetime']&quot;).val(getDateTime());
		return true;
	}
	
	function UnlockLoginTabs() {
		// Now show only those tabs that the logged in user should be able to show
		var parms = getParameterByName('disp');
		if (parms) {
			var lines = parms.split('|');
			$.each(lines, function(key, line) {
				var token = line.split(' ');
				displayTab(token);
			});
		}
	}
	function getAbsolutePath() {
	    var loc = window.location;
	    var pathName = loc.pathname.substring(0, loc.pathname.lastIndexOf('/') + 1);
	    return loc.href.substring(0, loc.href.length - ((loc.pathname + loc.search + loc.hash).length - pathName.length));
	}
	function forget_click(){	
		var hrf = window.location.href ;
		var ary = hrf.split('/');
		
		
		var newlocation = &quot;&quot; ;
		if(hrf.search('common') != -1){
			localStorage.setItem('resetid', ary[5]);
			newlocation = ary[0] + &quot;//&quot; + ary[2] + &quot;/PersiviaPortal/public/resetPassword.jsp?common=&quot;+ ary[5]  ;
		}else{
			localStorage.removeItem('resetid');
			newlocation = ary[0] + &quot;//&quot; + ary[2] + &quot;/PersiviaPortal/public/resetPassword.jsp&quot;  ;
		}
		window.location.href = newlocation ;
		
	}
	//
	/*  var userAgreementWnd = $('#userAgreementWnd') ;	
	function prepareAgreementWnd() {
		userAgreementWnd.kendoWindow({
			height : &quot;550px&quot;,
			width : &quot;1200px&quot;,
			minWidth : &quot;1150px&quot;,
			modal : true,
			visible : false,
			actions : [ &quot;Close&quot; ],
			title : &quot;User Aggrement&quot;,
			draggable : false,

		}).data(&quot;kendoWindow&quot;).center().open();
	} */
	
	//
	function initiateAgreement(){
		//Stop Escape key
		kendo.ui.Window.fn._keydown = function (originalFn) {
        var KEY_ESC = 27;
        return function (e) {
            if (e.which !== KEY_ESC) {
                originalFn.call(this, e);
            }
        };
    	}(kendo.ui.Window.fn._keydown);
    	
		var userAgreementWnd = $('#userAgreementWnd') ;
		userAgreementWnd.kendoWindow({
			height : &quot;550px&quot;,
			width : &quot;900px&quot;,
			minWidth : &quot;1000px&quot;,
			modal : true,
			visible : false,			
			title:  &quot;Terms And Conditions&quot;,
			draggable : false,
			resizable:false,

		}).data(&quot;kendoWindow&quot;).center().open();
		userAgreementWnd.data(&quot;kendoWindow&quot;).open();
		
    	$(&quot;#agreementContainter&quot;).show();
    	// hide close button
    	$('#userAgreementWnd').parent('.k-window').find(&quot;.k-window-action&quot;).css(&quot;visibility&quot;, &quot;hidden&quot;) ;
	}
	// agreement button clicked .
	function agreement_click(btn){
		var form = $(document.createElement('form'));
		$(form).attr(&quot;action&quot;, &quot;login&quot;);
		$(form).attr(&quot;method&quot;, &quot;POST&quot;);
		if(btn=='accept'){
			var input = $(&quot;&lt;input>&quot;)
			    .attr(&quot;type&quot;, &quot;hidden&quot;)
			    .attr(&quot;name&quot;, &quot;agreementBtn&quot;)
			    .val(&quot;accepted&quot; );
			$(form).append($(input));
			var input = $(&quot;&lt;input>&quot;)
			    .attr(&quot;type&quot;, &quot;hidden&quot;)
			    .attr(&quot;name&quot;, &quot;username&quot;)
			    .val(&quot;&quot;);
				$(form).append($(input));	
			
		}else if (btn=='cancel'){			
			var input = $(&quot;&lt;input>&quot;)
		    .attr(&quot;type&quot;, &quot;hidden&quot;)
		    .attr(&quot;name&quot;, &quot;agreementBtn&quot;)
		    .val(&quot;cancelled&quot; );
		$(form).append($(input));
		
		}
		form.appendTo( document.body )	
		$(form).submit();
		
	}
	
	
	//
	$(document)
			.ready(
					function() {
								
						try{					
								
								var title =  getBrand() ;
								if(title != &quot;&quot;){
									$('#divPerciviaBrand').hide();
									$('#spnOtherBrand').text(title) ;
									$('#divOtherBrandName').show();	
									
								}else{
									$('#divPerciviaBrand').show();
									$('#spnOtherBrand').text('') ;
									$('#divOtherBrandName').hide();
								}
							/* } */
						}catch(ex){
							console.log(ex);
						}
						
						//
						if($('.old-ie').length > 0){
							$('.old-ie-only').show();
						}
						$('#username, #userpwd').on('change', function(){
							assignLoginFormValues.call(this);
							
						}).on('keypress', function(e){
							if(e.which == 13){
								assignLoginFormValues.call(this);
								$('#formLogin').trigger('submit');
							}
						});
						
						

						function assignLoginFormValues(){
							var val = this.value;
							if(this.id == &quot;username&quot;){
								val = val.trim().toLowerCase()
							}
							$(&quot;[name='&quot;+this.id+&quot;']&quot;).val(val);
						}						
						UnlockLoginTabs();

						// automatically display the home tab
						$('a[href=&quot;#home&quot;]').tab('show');

						$('#myTabs').click('show', function(e) {
							path = $(e.target).attr('href');
							window.location = path;
						});	
						
						// Agreement						
						if(&quot;false&quot; == &quot;true&quot;){
							initiateAgreement();							
						}else{
							$(&quot;#agreementContainter&quot;).hide();
						}
						
						if(&quot;&quot; == &quot;cancelled&quot;){
							//alert(&quot; It is mandatory to accept our Terms and conditions before logging in to Persivia Poratl.If you do not agree to the terms and conditions you can email us at:ps-support@persivia.com&quot;) ;
							
						}
						
						$('#btnLogin1')
								.click(
										function() {
											var user = $('#username').val()
													.toLowerCase();
											var sites = null;

											// Faked out users
											if (user.indexOf('atul') == 0)
												sites = 'careManagement';
											else if (user.indexOf('mike') == 0)
												sites = 'careManagement';
											else if (user.indexOf('chinmay') == 0)
												sites = 'careManagement';
											else if (user.indexOf('pat') == 0)
												sites = 'careManagement';
											else if (user.indexOf('bob') == 0)
												sites = 'careManagement';
											else if (user.indexOf('harvinder') == 0)
												sites = 'careManagement';
											else if (user.indexOf('amit') == 0)
												sites = 'careManagement';
											else if (user.indexOf('mahender') == 0)
												sites = 'careManagement';
											else if (user.indexOf('monsoor') == 0)
												sites = 'careManagement';
											else if (user.indexOf('fauzia') == 0)
												sites = 'careManagement';
											else if (user.indexOf('kashif') == 0)
												sites = 'careManagement';
											else {
												alert('Username/password invalid\n\nHint: try using: Mikeq, Bob, Chinmay, Atul, Mahender, Monsoor, Fauzia, Amit, Harvinder, Kashif, or Pat');
												signedIn = false;

												return false;
											}

											signedIn = true;

											// build the url and replace the location's href
											var url = document.URL;
											var root = location.protocol + '//'
													+ location.host;
											var site = root
													+ &quot;/CareManagement/portlets/main.jsp?disp=&quot;
													+ encodeURIComponent(sites);

											document.location.href = site;
										});

						if (signedIn) {
							var signOut = $('#username').val() + ' Sign Out';
							alert(signOut)
							$('#navLogin').text(signOut);
						}

						$(window).trigger(&quot;resize&quot;); /*IMPORTANT*/

					});

	$(window).resize(function() {
		var viewportHeight = $(window).height();
		var viewportWidth = $(window).width();

		$('#patient-iframe').height(viewportHeight - navBarHeight);
		$('#dr-iframe').height(viewportHeight - navBarHeight);
		$('#cm-iframe').height(viewportHeight - navBarHeight);
		$('#financials').height(viewportHeight - navBarHeight);
		$('#home').height(viewportHeight - navBarHeight);
		$('#css').height(viewportHeight - navBarHeight);
		$('#mm').height(viewportHeight - navBarHeight);
	});
	function getBrand(){
		var brandTitle = &quot;&quot; ;
		var brandId = &quot;&quot; ;
		var pageUrl = window.location.pathname ;		
		if(pageUrl.search('PersiviaPortal') != -1 &amp;&amp; pageUrl.search('common')){
			var ary = pageUrl.split('/') ;
			if(ary.length==5){
				brandId = ary[3];
			}
			
		}
		if(brandId != &quot;&quot;){
			$.ajax({				
				url:&quot;/PersiviaPortal/getBrandTitle&quot;,
				data: {publicId:brandId},
				method: &quot;POST&quot;,
				async: false,				
				success: function(response){				
					brandTitle = response ;					
				}
			});
		}
		return brandTitle ;
	}
	
	

	
		
			
				
					Toggle navigation
					
					
					
				
				
					
				
			

		
		
			 
		
	
	
	
	
	
	




 
				
				We are sorry for the inconvenience. Please use Google Chrome for optimal performance. Thanks.
				
				
				
				
				
					
					Welcome to CareSpace®
					The trusted platform for Care Coordination
					Welcome to 
					
						
						
						
					
					
						Email
						
						Password
						
  					
					
					
					
						
						
						
						
							Sign in
						
						
						
							
							Forgot Password
						
						
							Don't have an account? Please contact your Facility Administrator  
						
					
					
					
						
							
							
						
						
							
							Customer Support
							
		                    
								If you are looking for additional support, please feel free to reach out to us any time at support@persivia.com or 877-561-8651.
								By using our site, you acknowledge that you have read and understand our Privacy Policy and Terms of Services located  here





		                    	
							
	                  	
					
					
				
  
 



 Copyright © 2014 - 2020 Persivia. All Rights Reserved.

	The version of browser you are using is not supported by this product. Please use Internet Explorer version 10 or 11, or Chrome 47.0.x
	
	
		
			 Download Chrome
		
		
			 Download Internet Explorer
		
	


 


        
            
        
    
  
  Accept
  Cancel
  
 
 
	       
        
    
        
            
                
                    
                        
                        Leading the transformation of the healthcare system by delivering the most innovative, leading-edge healthcare knowledge technology, based upon the most trusted, evidence-based giudelines.  Alere Analytics provides intelligent, actionable information that helps facilitate improved patient care, fewer errors, and better clinical outcomes. 
                        

                        
                        We empower clinicians to make more informed decisions, as well as patients to better manage their own care -- all on one platform that integrates seamlessly into any clinical or operational workflow.
                        
                        
                
            
        
    




$(&quot;#resetPassMessageDiv&quot;).fadeOut(5000);


	(function(){
		var fcmToken = localStorage.getItem(&quot;fcm_token&quot;);
		var fcmSenderId = localStorage.getItem(&quot;fcm_sid&quot;);
		if(fcmSenderId &amp;&amp; fcmToken){
			firebase.initializeApp({
				messagingSenderId: fcmSenderId
			});
			var messaging = firebase.messaging();

			if ('serviceWorker' in navigator) {
				navigator.serviceWorker.register(&quot;/PersiviaPortal/resources/js/firebase-messaging-sw.js?messagingSenderId=&quot; + fcmSenderId).then(function(worker) {
					// registration worked
					messaging.useServiceWorker(worker);
					messaging.deleteToken(fcmToken)
					.then(function() {
						localStorage.removeItem(&quot;fcm_token&quot;);
						localStorage.removeItem(&quot;fcm_sid&quot;);
						console.log('FCM Token deleted.');
					})
					.catch(function(err) {
						console.log('Unable to delete FCM token. ', err);
					});						
				}).catch(function(error) {
					// registration failed
					console.log('Registration failed with ' + error);
				});
			};
		}
	})();


function checkBrowserCompatibility()
{
	// Opera 8.0+
	var isOpera = (!!window.opr &amp;&amp; !!opr.addons) || !!window.opera || navigator.userAgent.indexOf(' OPR/') >= 0;

	// Firefox 1.0+
	var isFirefox = typeof InstallTrigger !== 'undefined';

	// Safari 3.0+ &quot;[object HTMLElementConstructor]&quot; 
	var isSafari = /constructor/i.test(window.HTMLElement) || (function (p) { return p.toString() === &quot;[object SafariRemoteNotification]&quot;; })(!window['safari'] || (typeof safari !== 'undefined' &amp;&amp; safari.pushNotification));

	// Internet Explorer 6-11
	var isIE = /*@cc_on!@*/false || !!document.documentMode;

	// Edge 20+
	var isEdge = !isIE &amp;&amp; !!window.StyleMedia;

	// Chrome 1 - 71
	var isChrome = !!window.chrome &amp;&amp; (!!window.chrome.webstore || !!window.chrome.runtime);

	// Edge (based on chromium) detection
	var isEdgeChromium = isChrome &amp;&amp; (navigator.userAgent.indexOf(&quot;Edg&quot;) != -1);

	// Blink engine detection
	var isBlink = (isChrome || isOpera) &amp;&amp; !!window.CSS;
	 var loginDiv = document.getElementById(&quot;login-Div&quot;);
	 var messageDiv = document.getElementById(&quot;messageDiv&quot;);
	if(isOpera || isFirefox || isSafari || isIE ||  isEdge || isEdgeChromium)
		{
		 messageDiv.style.display = &quot;block&quot;;
		 loginDiv.style.display = &quot;none&quot;;
		}
	else
		{
		 messageDiv.style.display = &quot;none&quot;;
		 loginDiv.style.display = &quot;block&quot;;
		}
}

checkBrowserCompatibility();


/html[@class=&quot;k-webkit k-webkit87&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;k-webkit k-webkit87&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)='']/parent::*</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
   </webElementXpaths>
</WebElementEntity>
