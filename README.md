Un auteur a un prénom, un nom et une date de naissance. Il est possible de créer un auteur en renseignant toutes ses données, ou sans la date de naissance, auquel cas elle sera nulle.
Un auteur possède une méthode fullName qui retourne le nom complet de l'auteur, soit les nom et prénom de l'auteur, séparé par un espace.
Un auteur possède une méthode authorInfos qui retourne le nom complet de l'auteur et sa date de naissance entre parenthèse, au format mois/jour/année. Si la date de naissance n'est pas renseignée, retourner juste le nom complet.

Un livre possède un titre, une description et un auteur. Il est possible d'initialiser un livre sans auteur, auquel cas il sera nul.
Un livre possède une méthode allCaps, qui retourne le titre avec chaque mot commençant par une majuscule.
Un livre possède une méthode authorInfos qui retourne le nom complet de l'auteur et sa date de naissance entre parenthèse, au format mois/jour/année. Si la date de naissance n'est pas renseigné, retourner juste le nom complet. Si l'auteur n'existe pas, retourner "Unknow author".
Un livre possède une méthode bookInfos, qui retourne le titre avec chaque mot commençant par une majuscule ainsi que les informations de l'auteur.
Un livre possède une méthode shortDescription, qui retourne les 30 premiers caractères de la description : si la description fait 30 caractères ou moins, la retourner entièrement, sinon trouver le mot le plus proche avant les 30 caractères, ajouter une ellipse (trois points) et couper la phrase.

Créer une bibliothèque qui recense au moins trois livres et qui pour chacun affiche bookInfos et shortDescription.

Bonus:
* Trier les livres par ordre de titre et afficher de nouveau la bibliothèque.
* Trier les livres par auteur et afficher de nouveau la bibliothèque.
