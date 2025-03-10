package lec_14.task;

import com.google.i18n.phonenumbers.PhoneNumberMatch;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import lec_14.lib.LibExample;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;
import org.apache.commons.validator.routines.EmailValidator;

public class StringPractickTask {
    // Перевірка email
    public boolean isEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        int atIndex = email.indexOf('@');
        if (atIndex < 1 || atIndex > email.length() - 1) {
            return false;
        }
        int dotIndex = email.indexOf('.');
        if (dotIndex == -1 || dotIndex == email.length() - 1) {
            return false;
        }
        return true;
    }

    public boolean emailValidator(String email) {
        return EmailValidator.getInstance().isValid(email);
    }

    public boolean phoneValidator(String phone, String region) {
        PhoneNumberUtil pn = PhoneNumberUtil.getInstance();
        return PhoneNumberUtil.getInstance().isPossibleNumber(phone, region);
    }

    // перетворення в camelCase
    public String toCamelCaseSU(String str) {
        return CaseUtils.toCamelCase(str, false);
    }

    public String toCamelCase(String str, boolean cfl) {
        String[] split = str.split(" ");

        int firstWorld = cfl ? 0 : 1;
        String result = "";
        if (firstWorld == 1) {
            result = split[0];
        }
        JavaMethods jm = new JavaMethods();
        for (int i = firstWorld; i < split.length; i++) {
            result = result.concat(jm.capitaliseFirstChar(split[i]));
        }

        return result;
    }


}
