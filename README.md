Twitter-For-Android
===================

Integracion de la libreria twitter4j para una app en Android.

- Lo primero que se necesita para poder trabajar con el nuevo API v1.1 de Twitter desde __Android__ es agregar a nuestro proyecto la libreria __Twitter4j__. La cual puedes descargarte desde este [link](http://twitter4j.org/en/) 

- Lo segundo es agregar estas librerias __.jar__ (que ya hemos descargado) a nuestro proyecto en _Android_.

		Para poder agregar dichas librerias .jar a nuestro proyecto, desde
		el Android Studio, es necesario realizar los siguientes pasos:
		1.- Copiar todo el contenido de la carpeta twitter4j/lib a la carpeta
		    lib de nuestro proyecto.
		2.- Desde el Android Studio nos dirigimos a la carpeta lib en el cual 
		    hemos colcado los .jar. Sobre cada .jar que agregemos debemos hacer click
		    derecho sobre ella y seleccionamos Agregar como Libreria (Add as Library)
		3.- Al hacer esto nos sale un dialogo donde nos indica el nombre de la
			libreria que estamos agregando y a que proyecto se lo estamos agregando. 
- _Referencias_
 	- ![lib](http://imageshack.us/photo/my-images/59/qhgg.png)
	- ![lib](http://imageshack.us/photo/my-images/845/u0zt.png)
	
- Luego debemos registrar una aplicacion en el site de __Developer de twitter__. [TwiterDev](http://dev.twitter.com) 
- Una vez registrada la aplicacion, es importante tomar en consdieracion los valores que se crean al momento de registrar dicha aplicacion, como lo son:
		- CONSUMER KEY
		- CONSUMER SECRET
		- ACCESS TOKEN 
		- ACCESS TOKEN SECRET
		Todas estos valores son necesarios para poder hacer uso del API v1.1
		
- Una vez realizado esto iniciaremos con el _codigo_.

#Configuracion

- Lo primero que debemos realizar es definir toda nuestra configuracion de acceso desde nuestro codigo __Java__, para esto se debe de realizar lo siguiente:

1.-Creamos una nueva clase llamada __TwitterConfig__ y en ella colocaremos lo siguiente:

		Definimos nuestras variables con los valores que ya comente.
		
		private final static String CONSUMER_KEY = "";
    	private final static String CONSUMER_SECRET_KEY = "";
	    private final static String ACCESS_TOKEN = "";
    	private final static String ACCES_TOKEN_SECRET = "";


	
