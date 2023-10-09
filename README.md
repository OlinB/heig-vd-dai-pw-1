# Labo 1 
## Groupe 3 : Olin Bourquin & Kevin Farine
#### But du CLI :
Le CLI replaceWord permet lors de son utilisation de remplacer toutes les
occurences d'un mot spécifique dans un fichier donné par un autre mot et
de l'enregistrer dans un nouveau fichier.
Il permet aussi la modification de l'encodage du fichier.

#### Comment construire le CLI
Lors de la récupération de la librairie, veuillez lancer la commande 
suivante afin de générez le fichier .jar :
_dependency:resolve clean compile package_

Une fois ceci fait, vous pourrez utiliser les commandes 
expliquées dans la section suivante
#### Comment utiliser le CLI
En imaginant qu'on ait un fichier input.txt contenant le texte suivant : 
"_Le chat roux d'Irène s'appele Jimmy. Ses autres chats s'appellent
Smitty et Kyle._"

Exemple 1 : replaceWord -i "input.txt" -o "output.txt" -s "chat" -r "chien"  
Sortie : le fichier input.txt restera inchangé et le fichier de sortie 
output.txt sera créé et aura comme texte :  
"_Le chien roux d'Irène
s'appelle Jimmy. Ses autres chiens s'appellent Smitty et Kyle._"

Exemple 2 : replaceWord -i "input.txt" -o "output.txt" -s "chat" -r "chien" --ie "UTF-8" --oe "ASCII"  
Sortie : le fichier input.txt restera inchangé et le fichier de sortie
output.txt sera créé et aura comme texte :  
"_Le chien roux d'IrÃ"ne
s'appelle Jimmy. Ses autres chiens s'appellent Smitty et Kyle._"