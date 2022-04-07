import java.util.Set;

public interface AddressDAO {
	void addAddress(Address address);
	void modifyAddress(Address adr);
	void deleteAddress(int addressId);
	Address findAddress(int addressId);
	Set<Address> findAllAddress();

}
