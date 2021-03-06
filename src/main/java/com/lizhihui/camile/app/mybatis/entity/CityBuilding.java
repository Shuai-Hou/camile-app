package com.lizhihui.camile.app.mybatis.entity;

public class CityBuilding {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AAM_CITY_BUILDING.BUILDING
     *
     * @mbggenerated
     */
    private String building;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AAM_CITY_BUILDING.BUILDING_NAME
     *
     * @mbggenerated
     */
    private String buildingName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AAM_CITY_BUILDING.CITY
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AAM_CITY_BUILDING.ENABLE
     *
     * @mbggenerated
     */
    private Short enable;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AAM_CITY_BUILDING
     *
     * @mbggenerated
     */
    public CityBuilding(String building, String buildingName, String city, Short enable) {
        this.building = building;
        this.buildingName = buildingName;
        this.city = city;
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AAM_CITY_BUILDING
     *
     * @mbggenerated
     */
    public CityBuilding() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AAM_CITY_BUILDING.BUILDING
     *
     * @return the value of AAM_CITY_BUILDING.BUILDING
     *
     * @mbggenerated
     */
    public String getBuilding() {
        return building;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AAM_CITY_BUILDING.BUILDING
     *
     * @param building the value for AAM_CITY_BUILDING.BUILDING
     *
     * @mbggenerated
     */
    public void setBuilding(String building) {
        this.building = building == null ? null : building.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AAM_CITY_BUILDING.BUILDING_NAME
     *
     * @return the value of AAM_CITY_BUILDING.BUILDING_NAME
     *
     * @mbggenerated
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AAM_CITY_BUILDING.BUILDING_NAME
     *
     * @param buildingName the value for AAM_CITY_BUILDING.BUILDING_NAME
     *
     * @mbggenerated
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AAM_CITY_BUILDING.CITY
     *
     * @return the value of AAM_CITY_BUILDING.CITY
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AAM_CITY_BUILDING.CITY
     *
     * @param city the value for AAM_CITY_BUILDING.CITY
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AAM_CITY_BUILDING.ENABLE
     *
     * @return the value of AAM_CITY_BUILDING.ENABLE
     *
     * @mbggenerated
     */
    public Short getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AAM_CITY_BUILDING.ENABLE
     *
     * @param enable the value for AAM_CITY_BUILDING.ENABLE
     *
     * @mbggenerated
     */
    public void setEnable(Short enable) {
        this.enable = enable;
    }
}