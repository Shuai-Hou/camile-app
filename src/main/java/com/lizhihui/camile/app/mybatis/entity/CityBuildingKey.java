package com.lizhihui.camile.app.mybatis.entity;

public class CityBuildingKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AAM_CITY_BUILDING.BUILDING
     *
     * @mbggenerated
     */
    private String building;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AAM_CITY_BUILDING
     *
     * @mbggenerated
     */
    public CityBuildingKey(String building) {
        this.building = building;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AAM_CITY_BUILDING
     *
     * @mbggenerated
     */
    public CityBuildingKey() {
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
}