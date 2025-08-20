
INTERFACE Searchable {
    METHOD search(String query)
}

INTERFACE Printable {
    METHOD print()
}

ABSTRACT CLASS MedicalReport IMPLEMENTS Searchable, Printable {
    STRING patientName

    METHOD MedicalReport(name) {
        patientName = name
    }
}


CLASS LabReport EXTENDS MedicalReport {
    METHOD search(query) {
        PRINT "Searching lab report for " + query
    }
    METHOD print() {
        PRINT "Printing lab report of " + patientName
    }
}

CLASS PrescriptionReport EXTENDS MedicalReport {
    METHOD search(query) {
        PRINT "Searching prescription for " + query
    }
    METHOD print() {
        PRINT "Printing prescription of " + patientName
    }
}


lab = LabReport("Amit")
presc = PrescriptionReport("Priya")

lab.search("blood test")
lab.print()

presc.search("antibiotics")
presc.print()
