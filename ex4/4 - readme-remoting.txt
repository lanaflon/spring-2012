exercice 4 :

*************************************************************************************
Objectif : 																			*
- mise en oeuvre du remoting avec HttpInvoker									    *
*************************************************************************************

1. D�clarer dans applicationContext.xml un HttpInvokerServiceExporter charg� d'exposer le commandProcessor

2. Ajouter au fichier web.xml une servlet permettant de rendre visible l'exporter d�clar� en 1.

3. Ajouter le bloc suivant dans le fichier applicationContext.xml (au dessus des autres blocs <security:http/> : 
 	<security:http pattern="/commandProcessorEndpoint">
		<security:http-basic  />
	</security:http>