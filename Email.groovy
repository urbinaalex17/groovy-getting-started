/* groovylint-disable ImplicitReturnStatement */
/* groovylint-disable-next-line ClassJavadoc */
class Email {

    String prospectName
    String emailAddress
    Date sendDate
    String notes

    String displayContents() {
        "Recipient: $prospectName \nAddress: $emailAddress \nDate: $sendDate \nSummmary: $notes"
    }

}
