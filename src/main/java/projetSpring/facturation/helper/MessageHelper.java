package projetSpring.facturation.helper;


public class MessageHelper {
    
    public static String success() {
		return "Opération effectuée avec succès";
	}

	public static String echec() {
		return "Opération échouée";
	}

	public static String updateMsg() {
		return "Modification effectuée avec succès";
	}

	public static String message(String msg) {
		return msg;
	}

	public static String error(String message) {
		return message;
	}

	public static String sizeCaractere(String champ, int size) {
		return " Veuillez saisir " + champ + " dont le nombre de caractère est égale à " + size + "";
	}

	public static String unauthorized() {
		return "Authentification requise";
	}

	public static String forbidden() {
		return "Autorisation requise";
	}

	public static String badToken() {
		return "Jeton d'authentification invalide";
	}

	public static String loginFail() {
		return "Paramètres d'authentification incorrects";
	}

	public static String loginFail(String note) {
		return MessageHelper.loginFail() + ": " + note;
	}

	public static String loginSuccess() {
		return "Authentification effectuée avec success!";
	}

	public static String blocked() {
		return "L' utilisateur a été bloqué";
	}

	public static String enabledUser() {
		return "L'utilisateur a été desactivé";
	}

	public static String internalServer() {
		return "Quelque chose a mal tournée";
	}

	public static String methodNotAllowed() {
		return "Methode non autorisée";
	}

	public static String notAcceptable() {
		return "requête non acceptable";
	}

	public static String timeOut() {
		return "Le temps de la requête dépassé";
	}

	public static String conflict() {
		return "Un conflict a été signalé lors de la requête";
	}

	public static String internalServer(String exception_message) {
		return "Quelque chose a mal tournée: " + exception_message;
	}

	public static String unprocessed() {
		return "Une erreur sémantique a été constatée";
	}

	public static String createdSuccessfully() {
		return "Enregistrement effectué avec succès!";
	}

	public static String createFail() {
		return "Echec d'enregistrement";
	}

	public static String createFail(String name) {
		return "Echec d'enregistrement : " + name;
	}

	public static String createdSuccessfully(String name) {
		return name + " enregistré avec succès!";
	}

	public static String updatedSuccessFully() {
		return "Mise à jour affectuée avec succès!";
	}

	public static String updatedSuccessfully(String name) {
		return "Mise à jour de " + name + " effectuée avec succès!";
	}

	public static String notFound() {
		return "Ressource introuvable";
	}

	public static String notFound(String name) {
		return name + " introuvable!";
	}

	public static String noContent() {
		return "Aucune donnée à afficher!";
	}

	public static String deletedSuccessFully() {
		return "Suppression éffectuée avec succès!";
	}

	public static String deletedElementUsed() {
		return "Echec de suppression car cet élément est lié à d'autres données!";
	}

	public static String noContent(String name) {
		return "Aucun " + name + " à afficher";
	}

	public static String dataExist(String name) {
		return name + "  est déjà utilisé ";
	}

	public static String canNotBeNull() {
		return "Ne peut être null";
	}

	public static String canNotBeNull(String name) {

		return name + " " + canNotBeNull();
	}

	public static String codecanNotBeNull() {

		return "Le code est obligatoire";
	}

	public static String designationcanNotBeNull() {

		return "Le libellé est obligatoire";
	}

	public static String nombreMinMaxCaracteres() {
        return "Le code doit être composé par deux caractères";
    }

	public static String designationcanNotBeEmpty() {
        return "La désignation est obligatoire ";
    }
	
	public static String parametreExist() {
		return "Un autre Paramètre de ce code et cette libellé est actif";
    }

	public static String dateDebutcanNotEmpty() {
        return "La date début est obligatoire";
    }

	public static String datecanNotComeAfterToday(String name) {
		return "La date " + name + " ne doit pas être supérieure à la date du jour";
    }

	public static String dateDebutcanNotComeAfterDateFin() {
        return "La date début ne doit pas être supérieure à la date fin";
    }

	public static String dateDebutAndFincanBeDiffent() {
		return "La date début doit être différente à la date fin";
	}

	public static String dateDebutDeCommuneVsDateDebutDeProvince() {
		return "La date début de la province doit etre supérieur ou égale a celle de la commune";
    }

	public static String modifyEnteteOnDetailsDisacle(String name1, String name2) {
		return "Impossible de modifier " + name1 + " sur une " + name2 + " inactive";
	}

	public static String doesntExist(String name) {
		return name + " n'existe plus";
	}

	public static String endDateIsObliged() {
		return "Veuillez préciser la date fin";
	}

	public static String codeOrLibelleUsedString() {

		return "Veuillez préciser la date fin car le code ou désignation est utilisé";
	}

	public static String existeElement(String element) {

		return "Un autre " + element + " actif existe déjà.";
	}

	public static String existeIntervalle() {

		return "Cette intervalle de validité est déjà utilisé.";
	}

	public static String existeDateValidite(String element, String date) {

		return "un autre " + element + " de " + date + " de validité existe déjà.";
	}

    public static String sizeExceed(String champ, int size) {
		return " Les caractères du champ " + champ + " ne doivent pas dépasser " + size + "";
	}
   
}
