/* Script to get started with Groovy */

String currency = 'USD'

int[] opportunities = [500, 4000, 5000]

println "You now have got ${opportunities.length} opportunities."

/* groovylint-disable-next-line DuplicateNumberLiteral */
for (int opportunity in opportunities) {
    if (opportunity <= 999) {
        /* groovylint-disable-next-line LineLength */
        println "Opportunity of ${currency} ${opportunity}. The best approach for opportunities of this size is email."
    } else if (opportunity >= 1000 && opportunity < 4999) {
        /* groovylint-disable-next-line LineLength */
        println "Opportunity of ${currency} ${opportunity}. The best approach for opportunities of this size is telephone."
    } else {
        /* groovylint-disable-next-line LineLength */
        println "Opportunity of ${currency} ${opportunity}. The best approach for opportunities of this size is face to face."
    }
}
