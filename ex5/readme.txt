1. Compl�ter le fichier pom.xml en d�clarant une d�pendance vers :
   * org.springframework	spring-jms					3.1.2.RELEASE
   
2. Ecrire le code du serveur (com.acme.ex5.messaging.Server)

3. Ecrire le code du client asynchrone en indiquant au moment de l'envoi 
la queue dans laquelle le serveur doit renvoyer la r�ponse

4. Impl�menter la m�thode onMessage du client asynchrone afin qu'il puisse recevoir la r�ponse � la "question qu'il a pos�e"
et que le serveur a envoy�e sur la queue des r�ponses

4. Inscrire dans le contexte les beans 'techniques' n�cessaires au bon fonctionnement 
de la discussion client / serveur
=> 2 queues
=> 1 jms template
=> un MessageListenerContainer pour les 'r�cepteurs' de messages