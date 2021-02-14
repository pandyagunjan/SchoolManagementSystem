package runner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import runner.entities.Staff;
import runner.repositories.StaffRepo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
@Service
public class StaffServices {
    @Autowired
    private StaffRepo staffRepo;

    private final static Logger logger = Logger.getLogger(StaffServices.class.getName());

    public int createStaff(Staff staff) {
        logger.log(Level.INFO, "Staff has been created!" + staff.getFirstName());
        List<Staff> staffs = fetchAll();
        for (Staff staffFromList : staffs) {
            if (staffFromList.getFirstName().equals(staff.getFirstName())) {
                return 1;
            }
        }
        staffRepo.save(staff);
        return 0; // Staff is successfully created
    }

    public Staff readStaff(Long id) {
        return staffRepo.findStaffById(id);
    }

    public Staff updateStaff(Staff staff) {
        Staff fetchLogin = readStaff(staff.getId());
        if (fetchLogin != null) {
            staff.setId(fetchLogin.getId());
            staffRepo.save(staff);
            logger.log(Level.INFO, "Staff has been updated");
            return staff;
        }
        logger.log(Level.WARNING, "Staff not found , null is being returned");
        return null;
    }


    public boolean removeTheStaff(Long id) {
        Staff staff = readStaff(id);
        if (staff != null) {
            staffRepo.delete(staff);
            logger.log(Level.INFO, "Staff has been deleted");
            return true;
        }
        logger.log(Level.WARNING, "Staff not found , null is being returned");
        return false;
    }

    public List<Staff> fetchAll() {
        return staffRepo.findAll();
    }
}
