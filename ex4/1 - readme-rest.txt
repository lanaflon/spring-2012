1. Compl�ter le fichier pom.xml en d�clarant une d�pendance vers :
   * javax.inject			javax.inject				1
   * com.acme				ex3							0.0.1
   * org.springframework	spring-webmvc				3.1.2.RELEASE

2. D�clarer la servlet spring sous le nom 'rest' dans le fichier web.xml, l'associer au pattern d'url /rest/*

3. Mettre en oeuvre un endpoint REST (com.acme.ex4.HrEndpoint) contenant 4 m�thodes, g�rant respectivement les URL suivante : 
http://localhost:8080/ex4/rest/candidate/{id} en GET renvoie le d�tail d'un candidat
http://localhost:8080/ex4/rest/employee/{id} en GET renvoie le d�tail d'un employe
http://localhost:8080/ex4/rest/candidates en POST renvoie une liste de candidats sur la base d'un CandidateFilter recu via la requ�te HTTP
http://localhost:8080/ex4/rest/employees en POST renvoie une liste d'employ�s sur la base d'un EmployeeFilter via la requ�te HTTP