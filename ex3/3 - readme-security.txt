exercice 3 :

*************************************************************************************
Objectif : 																			*
- mise en oeuvre de spring security												    *
*************************************************************************************

1. Compl�ter le fichier pom.xml en d�clarant une d�pendance vers :
   * org.springframework.security	spring-security-config					3.1.0.RELEASE
   
2. Reprendre la classe com.acme.common.broker.impl.SecurityPreProcessor. Dans la m�thode preProcess :
   R�cup�rer le contexte de s�curit� (SecurityContextHolder.getContext())
   S'il est non nul et si SecurityContextHolder.getContext().getAuthentication()!=null :
   Afficher (System.out.println) le nom de l'utilisateur 
   
   Pour aller plus loin : ajouter une annotation @RolesAllowed sur une des commande et v�rifier que l'utilisateur
   en cours a un des roles permettant de 'jouer' la commande tranmise � la m�thode preProcess.
   Utiliser pour cela SecurityContextHolder.getContext().getAuthentication().getAuthorities()