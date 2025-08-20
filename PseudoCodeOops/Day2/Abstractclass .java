
ABSTRACT CLASS Crop {
    STRING name

    METHOD Crop(cropName) {
        name = cropName
    }

    ABSTRACT METHOD getWaterRequirement()
    ABSTRACT METHOD harvest()
}

CLASS Rice EXTENDS Crop {
    METHOD Rice() {
        SUPER("Rice")
    }

    METHOD getWaterRequirement() {
        RETURN "Needs 1200 liters per acre"
    }

    METHOD harvest() {
        PRINT "Harvesting Rice..."
    }
}

CLASS Wheat EXTENDS Crop {
    METHOD Wheat() {
        SUPER("Wheat")
    }

    METHOD getWaterRequirement() {
        RETURN "Needs 800 liters per acre"
    }

    METHOD harvest() {
        PRINT "Harvesting Wheat..."
    }
}

ice()
PRINT riceCrop.getWaterRequirement()
riceCrop.harvest()

CREATE wheatCrop = Wheat()
PRINT wheatCrop.getWaterRequirement()
wheatCrop.harvest()
