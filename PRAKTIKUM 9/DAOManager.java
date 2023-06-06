/**
 * File      : DAOManager.java		31/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : pengelola DAO dalam program
 * 
 */
public class DAOManager{
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO person) { 
		personDAO = person;
	}
	public PersonDAO getPersonDAO () {
		return personDAO;
	}
}