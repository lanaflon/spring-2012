exercice 3 :

*************************************************************************************
Objectif : 																			*
- mise en oeuvre du remoting (c�t� client) avec HttpInvoker	   						*
*************************************************************************************

1. Compl�ter le fichier pom.xml en d�clarant une d�pendance vers :
   * org.springframework.security	spring-security-remoting				3.1.0.RELEASE
   
2. Dans le fichier appCtxBroker.xml de ex3 : 
   ajouter pour la propri�t� neighbours un ou plusieurs HttpInvokerProxyFactoryBean 
   vers les autre CommandProcessor disponibles sur le r�seau et expos�s avec HttpInvoker.