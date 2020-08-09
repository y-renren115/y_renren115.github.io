package instance_static_final;

import java.util.Objects;

public class instanceOfY {

	private String firstname;

	public instanceOfY(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof instanceOfY)) {
			return false;
		}
		instanceOfY other = (instanceOfY) obj;
		return Objects.equals(firstname, other.firstname);
	}
}
