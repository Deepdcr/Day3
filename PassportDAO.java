import java.util.Set;

public interface PassportDAO {
	void addPassport(Passport passport);
	void modifyPassport(Passport pprt);
	void deletePassport(int passportId);
	Passport findPassport(int passportId);
	Set<Passport> findAllPassport();
}
