package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_DIETARY_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DIETARY_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ROLE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ROLE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_STUDENT_NUMBER_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_STUDENT_NUMBER_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_YEAR_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_YEAR_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withYear("2").withStudentNumber("A1234567X").withEmail("alice@example.com")
            .withPhone("94351253").withDietaryRequirements("Vegetarian").withRole("Member")
            .withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withYear("3").withStudentNumber("B2345678Y").withEmail("johnd@example.com")
            .withPhone("98765432").withDietaryRequirements("No restrictions").withRole("Member")
            .withTags("owesMoney", "friends").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz")
            .withYear("1").withStudentNumber("C3456789Z").withEmail("heinz@example.com")
            .withPhone("95352563").withDietaryRequirements("No restrictions").withRole("Member").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier")
            .withYear("4").withStudentNumber("D4567890A").withEmail("cornelia@example.com")
            .withPhone("87652533").withDietaryRequirements("Vegetarian").withRole("Member")
            .withTags("friends").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer")
            .withYear("2").withStudentNumber("E5678901B").withEmail("werner@example.com")
            .withPhone("94822240").withDietaryRequirements("No restrictions").withRole("Member").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz")
            .withYear("5").withStudentNumber("F6789012C").withEmail("lydia@example.com")
            .withPhone("94824270").withDietaryRequirements("Halal").withRole("Member").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best")
            .withYear("6").withStudentNumber("G7890123D").withEmail("anna@example.com")
            .withPhone("94824420").withDietaryRequirements("No restrictions").withRole("Member").build();
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("84824240")
            .withEmail("stefan@example.com").withYear("2").withStudentNumber("H8901234E")
            .withDietaryRequirements("Halal").withRole("Member").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("84821310")
            .withEmail("hans@example.com").withYear("3").withStudentNumber("I9012345F")
            .withDietaryRequirements("No restrictions").withRole("Member").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY)
            .withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY)
            .withYear(VALID_YEAR_AMY)
            .withStudentNumber(VALID_STUDENT_NUMBER_AMY)
            .withDietaryRequirements(VALID_DIETARY_AMY)
            .withRole(VALID_ROLE_AMY)
            .withTags(VALID_TAG_FRIEND)
            .build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB)
            .withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB)
            .withYear(VALID_YEAR_BOB)
            .withStudentNumber(VALID_STUDENT_NUMBER_BOB)
            .withDietaryRequirements(VALID_DIETARY_BOB)
            .withRole(VALID_ROLE_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE, HOON, IDA));
    }
}
