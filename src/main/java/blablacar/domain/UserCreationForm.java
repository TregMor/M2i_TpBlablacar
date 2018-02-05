package blablacar.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserCreationForm {

	@NotNull	
	private String firstName;
	@NotNull	
	private String lastName;
	
	@NotNull	
	private String login;
	
	@NotNull
	@Size(min=4, max=8)
	private String password;
	
	public String getFirstName() {
		return firstName;}
	public void setFirstName(String firstName) {
		this.firstName = firstName;}
	public String getLastName() {
		return lastName;}
	public void setLastName(String lastName) {
		this.lastName = lastName;}
	
	public String getLogin() {
		return login;}
	public void setLogin(String login) {
		this.login = login;}

	public String getPassword() {
		return password;}
	public void setPassword(String password) {
		this.password = password;}
		
}
