package daggr.ui.steps.persons;

import daggr.ui.pages.persons.PersonsListPage;
import io.cucumber.java.en.Then;

public class PersonsList {
	PersonsListPage persons_list_page = new PersonsListPage();
	
	@Then ("^Search By Person Name (.+)$")
	public void search_by_person_name(String person_name){
		persons_list_page.search_person_name_in_list(person_name);
	}
}
