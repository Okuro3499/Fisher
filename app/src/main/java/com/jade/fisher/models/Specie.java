
package com.jade.fisher.models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Specie {

    @SerializedName("Fishery Management")
    @Expose
    private String fisheryManagement;
    @SerializedName("Habitat")
    @Expose
    private String habitat;
    @SerializedName("Habitat Impacts")
    @Expose
    private String habitatImpacts;
    @SerializedName("Image Gallery")
    @Expose
    private List<ImageGallery> imageGallery = null;
    @SerializedName("Location")
    @Expose
    private String location;
    @SerializedName("NOAA Fisheries Region")
    @Expose
    private String nOAAFisheriesRegion;
    @SerializedName("Population")
    @Expose
    private String population;
    @SerializedName("Population Status")
    @Expose
    private String populationStatus;
    @SerializedName("Scientific Name")
    @Expose
    private String scientificName;
    @SerializedName("Species Aliases")
    @Expose
    private String speciesAliases;
    @SerializedName("Species Illustration Photo")
    @Expose
    private SpeciesIllustrationPhoto speciesIllustrationPhoto;
    @SerializedName("Species Name")
    @Expose
    private String speciesName;
    @SerializedName("Availability")
    @Expose
    private String availability;
    @SerializedName("Biology")
    @Expose
    private String biology;
    @SerializedName("Bycatch")
    @Expose
    private String bycatch;
    @SerializedName("Calories")
    @Expose
    private String calories;
    @SerializedName("Carbohydrate")
    @Expose
    private String carbohydrate;
    @SerializedName("Cholesterol")
    @Expose
    private String cholesterol;
    @SerializedName("Fat, Total")
    @Expose
    private String fatTotal;
    @SerializedName("Fiber, Total Dietary")
    @Expose
    private String fiberTotalDietary;
    @SerializedName("Fishing Rate")
    @Expose
    private String fishingRate;
    @SerializedName("Harvest")
    @Expose
    private String harvest;
    @SerializedName("Harvest Type")
    @Expose
    private String harvestType;
    @SerializedName("Health Benefits")
    @Expose
    private String healthBenefits;
    @SerializedName("Physical Description")
    @Expose
    private String physicalDescription;
    @SerializedName("Protein")
    @Expose
    private String protein;
    @SerializedName("Quote")
    @Expose
    private String quote;
    @SerializedName("Quote Background Color")
    @Expose
    private String quoteBackgroundColor;
    @SerializedName("Research")
    @Expose
    private String research;
    @SerializedName("Saturated Fatty Acids, Total")
    @Expose
    private String saturatedFattyAcidsTotal;
    @SerializedName("Selenium")
    @Expose
    private String selenium;
    @SerializedName("Serving Weight")
    @Expose
    private String servingWeight;
    @SerializedName("Servings")
    @Expose
    private String servings;
    @SerializedName("Sodium")
    @Expose
    private String sodium;
    @SerializedName("Source")
    @Expose
    private String source;
    @SerializedName("Sugars, Total")
    @Expose
    private String sugarsTotal;
    @SerializedName("Taste")
    @Expose
    private String taste;
    @SerializedName("Texture")
    @Expose
    private String texture;
    @SerializedName("Path")
    @Expose
    private String path;
    @SerializedName("last_update")
    @Expose
    private String lastUpdate;

    /**
     * No args constructor for use in serialization
     */
    public Specie() {
    }

    /**
     * @param fiberTotalDietary
     * @param imageGallery
     * @param habitat
     * @param scientificName
     * @param saturatedFattyAcidsTotal
     * @param taste
     * @param availability
     * @param source
     * @param habitatImpacts
     * @param populationStatus
     * @param carbohydrate
     * @param research
     * @param nOAAFisheriesRegion
     * @param fatTotal
     * @param path
     * @param servings
     * @param quote
     * @param speciesName
     * @param selenium
     * @param protein
     * @param cholesterol
     * @param speciesAliases
     * @param harvestType
     * @param harvest
     * @param biology
     * @param fishingRate
     * @param quoteBackgroundColor
     * @param texture
     * @param servingWeight
     * @param calories
     * @param fisheryManagement
     * @param population
     * @param sodium
     * @param lastUpdate
     * @param speciesIllustrationPhoto
     * @param sugarsTotal
     * @param location
     * @param bycatch
     * @param healthBenefits
     * @param physicalDescription
     */
    public Specie(String fisheryManagement, String habitat, String habitatImpacts, List<ImageGallery> imageGallery, String location, String nOAAFisheriesRegion, String population, String populationStatus, String scientificName, String speciesAliases, SpeciesIllustrationPhoto speciesIllustrationPhoto, String speciesName, String availability, String biology, String bycatch, String calories, String carbohydrate, String cholesterol, String fatTotal, String fiberTotalDietary, String fishingRate, String harvest, String harvestType, String healthBenefits, String physicalDescription, String protein, String quote, String quoteBackgroundColor, String research, String saturatedFattyAcidsTotal, String selenium, String servingWeight, String servings, String sodium, String source, String sugarsTotal, String taste, String texture, String path, String lastUpdate) {
        super();
        this.fisheryManagement = fisheryManagement;
        this.habitat = habitat;
        this.habitatImpacts = habitatImpacts;
        this.imageGallery = imageGallery;
        this.location = location;
        this.nOAAFisheriesRegion = nOAAFisheriesRegion;
        this.population = population;
        this.populationStatus = populationStatus;
        this.scientificName = scientificName;
        this.speciesAliases = speciesAliases;
        this.speciesIllustrationPhoto = speciesIllustrationPhoto;
        this.speciesName = speciesName;
        this.availability = availability;
        this.biology = biology;
        this.bycatch = bycatch;
        this.calories = calories;
        this.carbohydrate = carbohydrate;
        this.cholesterol = cholesterol;
        this.fatTotal = fatTotal;
        this.fiberTotalDietary = fiberTotalDietary;
        this.fishingRate = fishingRate;
        this.harvest = harvest;
        this.harvestType = harvestType;
        this.healthBenefits = healthBenefits;
        this.physicalDescription = physicalDescription;
        this.protein = protein;
        this.quote = quote;
        this.quoteBackgroundColor = quoteBackgroundColor;
        this.research = research;
        this.saturatedFattyAcidsTotal = saturatedFattyAcidsTotal;
        this.selenium = selenium;
        this.servingWeight = servingWeight;
        this.servings = servings;
        this.sodium = sodium;
        this.source = source;
        this.sugarsTotal = sugarsTotal;
        this.taste = taste;
        this.texture = texture;
        this.path = path;
        this.lastUpdate = lastUpdate;
    }

    public String getFisheryManagement() {
        return fisheryManagement;
    }

    public void setFisheryManagement(String fisheryManagement) {
        this.fisheryManagement = fisheryManagement;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitatImpacts() {
        return habitatImpacts;
    }

    public void setHabitatImpacts(String habitatImpacts) {
        this.habitatImpacts = habitatImpacts;
    }

    public List<ImageGallery> getImageGallery() {
        return imageGallery;
    }

    public void setImageGallery(List<ImageGallery> imageGallery) {
        this.imageGallery = imageGallery;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNOAAFisheriesRegion() {
        return nOAAFisheriesRegion;
    }

    public void setNOAAFisheriesRegion(String nOAAFisheriesRegion) {
        this.nOAAFisheriesRegion = nOAAFisheriesRegion;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPopulationStatus() {
        return populationStatus;
    }

    public void setPopulationStatus(String populationStatus) {
        this.populationStatus = populationStatus;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getSpeciesAliases() {
        return speciesAliases;
    }

    public void setSpeciesAliases(String speciesAliases) {
        this.speciesAliases = speciesAliases;
    }

    public SpeciesIllustrationPhoto getSpeciesIllustrationPhoto() {
        return speciesIllustrationPhoto;
    }

    public void setSpeciesIllustrationPhoto(SpeciesIllustrationPhoto speciesIllustrationPhoto) {
        this.speciesIllustrationPhoto = speciesIllustrationPhoto;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getBiology() {
        return biology;
    }

    public void setBiology(String biology) {
        this.biology = biology;
    }

    public String getBycatch() {
        return bycatch;
    }

    public void setBycatch(String bycatch) {
        this.bycatch = bycatch;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(String carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public String getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(String cholesterol) {
        this.cholesterol = cholesterol;
    }

    public String getFatTotal() {
        return fatTotal;
    }

    public void setFatTotal(String fatTotal) {
        this.fatTotal = fatTotal;
    }

    public String getFiberTotalDietary() {
        return fiberTotalDietary;
    }

    public void setFiberTotalDietary(String fiberTotalDietary) {
        this.fiberTotalDietary = fiberTotalDietary;
    }

    public String getFishingRate() {
        return fishingRate;
    }

    public void setFishingRate(String fishingRate) {
        this.fishingRate = fishingRate;
    }

    public String getHarvest() {
        return harvest;
    }

    public void setHarvest(String harvest) {
        this.harvest = harvest;
    }

    public String getHarvestType() {
        return harvestType;
    }

    public void setHarvestType(String harvestType) {
        this.harvestType = harvestType;
    }

    public String getHealthBenefits() {
        return healthBenefits;
    }

    public void setHealthBenefits(String healthBenefits) {
        this.healthBenefits = healthBenefits;
    }

    public String getPhysicalDescription() {
        return physicalDescription;
    }

    public void setPhysicalDescription(String physicalDescription) {
        this.physicalDescription = physicalDescription;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuoteBackgroundColor() {
        return quoteBackgroundColor;
    }

    public void setQuoteBackgroundColor(String quoteBackgroundColor) {
        this.quoteBackgroundColor = quoteBackgroundColor;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    public String getSaturatedFattyAcidsTotal() {
        return saturatedFattyAcidsTotal;
    }

    public void setSaturatedFattyAcidsTotal(String saturatedFattyAcidsTotal) {
        this.saturatedFattyAcidsTotal = saturatedFattyAcidsTotal;
    }

    public String getSelenium() {
        return selenium;
    }

    public void setSelenium(String selenium) {
        this.selenium = selenium;
    }

    public String getServingWeight() {
        return servingWeight;
    }

    public void setServingWeight(String servingWeight) {
        this.servingWeight = servingWeight;
    }

    public String getServings() {
        return servings;
    }

    public void setServings(String servings) {
        this.servings = servings;
    }

    public String getSodium() {
        return sodium;
    }

    public void setSodium(String sodium) {
        this.sodium = sodium;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSugarsTotal() {
        return sugarsTotal;
    }

    public void setSugarsTotal(String sugarsTotal) {
        this.sugarsTotal = sugarsTotal;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
