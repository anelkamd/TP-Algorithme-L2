
#include <iostream>
#include <string>

using namespace std;

int main() {
    const int nbEtudiants = 10;
    const int nbCours = 6;

    // Déclaration des points maximaux pour chaque cours
    int pointsMaximaux[nbCours] = {100, 120, 80, 80, 120, 100};

    // Tableau pour stocker les noms des étudiants
    string nomsEtudiants[nbEtudiants];

    // Tableau pour stocker les notes de chaque étudiant dans chaque cours
    int notesEtudiants[nbEtudiants][nbCours];

    // Saisie des noms des étudiants et de leurs notes
    for (int i = 0; i < nbEtudiants; ++i) {
        cout << "Nom de l'etudiant " << i+1 << " : ";
        cin >> nomsEtudiants[i];

        cout << "Entrez les notes pour " << nomsEtudiants[i] << endl;
        for (int j = 0; j < nbCours; ++j) {
            cout << "Note pour le cours " << j+1 << " (sur " << pointsMaximaux[j] << " points) : ";
            cin >> notesEtudiants[i][j];
        }
    }

    // Calcul des pourcentages et des mentions pour chaque étudiant
    for (int i = 0; i < nbEtudiants; ++i) {
        double moyenneGenerale = 0.0;

        cout << "Etudiant : " << nomsEtudiants[i] << endl;
        cout << "Notes obtenues :" << endl;

        for (int j = 0; j < nbCours; ++j) {
            double pourcentage = (static_cast<double>(notesEtudiants[i][j]) / pointsMaximaux[j]) * 100;
            moyenneGenerale += pourcentage;

            cout << "Cours " << j+1 << " : " << notesEtudiants[i][j] << " / " << pointsMaximaux[j] << " - Pourcentage : " << pourcentage << "%" << endl;
        }

        moyenneGenerale /= nbCours;

        cout << "Moyenne generale : " << moyenneGenerale << "%" << endl;

        // Détermination de la mention
        string mention;
        if (moyenneGenerale >= 55 && moyenneGenerale < 70) {
            mention = "Satisfaction";
        } else if (moyenneGenerale >= 70 && moyenneGenerale < 80) {
            mention = "Distinction";
        } else if (moyenneGenerale >= 80 && moyenneGenerale < 90) {
            mention = "Grande Distinction";
        } else if (moyenneGenerale >= 90 && moyenneGenerale <= 100) {
            mention = "Très Grande Distinction";
        }

        cout << "Mention : " << mention << endl;
        cout << endl;
    }

    return 0;
}
