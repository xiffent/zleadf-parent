package com.zlead.fplat.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseAddrarea implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.area_id
     *
     * @mbg.generated
     */
    private Integer areaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.area_code
     *
     * @mbg.generated
     */
    private String areaCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.area_name
     *
     * @mbg.generated
     */
    private String areaName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.area_type
     *
     * @mbg.generated
     */
    private String areaType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.short_name
     *
     * @mbg.generated
     */
    private String shortName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.english_name
     *
     * @mbg.generated
     */
    private String englishName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.area_level
     *
     * @mbg.generated
     */
    private String areaLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.parea_id
     *
     * @mbg.generated
     */
    private Integer pareaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.parea_code
     *
     * @mbg.generated
     */
    private String pareaCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.area_state
     *
     * @mbg.generated
     */
    private String areaState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.pinyin
     *
     * @mbg.generated
     */
    private String pinyin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.pinyin_sh
     *
     * @mbg.generated
     */
    private String pinyinSh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.tel_head
     *
     * @mbg.generated
     */
    private String telHead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.zip_code
     *
     * @mbg.generated
     */
    private String zipCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.area_desc
     *
     * @mbg.generated
     */
    private String areaDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.creator
     *
     * @mbg.generated
     */
    private Integer creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.modifier
     *
     * @mbg.generated
     */
    private Integer modifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_addrarea.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_addrarea
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.area_id
     *
     * @return the value of base_addrarea.area_id
     *
     * @mbg.generated
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.area_id
     *
     * @param areaId the value for base_addrarea.area_id
     *
     * @mbg.generated
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.area_code
     *
     * @return the value of base_addrarea.area_code
     *
     * @mbg.generated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.area_code
     *
     * @param areaCode the value for base_addrarea.area_code
     *
     * @mbg.generated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.area_name
     *
     * @return the value of base_addrarea.area_name
     *
     * @mbg.generated
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.area_name
     *
     * @param areaName the value for base_addrarea.area_name
     *
     * @mbg.generated
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.area_type
     *
     * @return the value of base_addrarea.area_type
     *
     * @mbg.generated
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.area_type
     *
     * @param areaType the value for base_addrarea.area_type
     *
     * @mbg.generated
     */
    public void setAreaType(String areaType) {
        this.areaType = areaType == null ? null : areaType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.short_name
     *
     * @return the value of base_addrarea.short_name
     *
     * @mbg.generated
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.short_name
     *
     * @param shortName the value for base_addrarea.short_name
     *
     * @mbg.generated
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.english_name
     *
     * @return the value of base_addrarea.english_name
     *
     * @mbg.generated
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.english_name
     *
     * @param englishName the value for base_addrarea.english_name
     *
     * @mbg.generated
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.area_level
     *
     * @return the value of base_addrarea.area_level
     *
     * @mbg.generated
     */
    public String getAreaLevel() {
        return areaLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.area_level
     *
     * @param areaLevel the value for base_addrarea.area_level
     *
     * @mbg.generated
     */
    public void setAreaLevel(String areaLevel) {
        this.areaLevel = areaLevel == null ? null : areaLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.parea_id
     *
     * @return the value of base_addrarea.parea_id
     *
     * @mbg.generated
     */
    public Integer getPareaId() {
        return pareaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.parea_id
     *
     * @param pareaId the value for base_addrarea.parea_id
     *
     * @mbg.generated
     */
    public void setPareaId(Integer pareaId) {
        this.pareaId = pareaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.parea_code
     *
     * @return the value of base_addrarea.parea_code
     *
     * @mbg.generated
     */
    public String getPareaCode() {
        return pareaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.parea_code
     *
     * @param pareaCode the value for base_addrarea.parea_code
     *
     * @mbg.generated
     */
    public void setPareaCode(String pareaCode) {
        this.pareaCode = pareaCode == null ? null : pareaCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.area_state
     *
     * @return the value of base_addrarea.area_state
     *
     * @mbg.generated
     */
    public String getAreaState() {
        return areaState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.area_state
     *
     * @param areaState the value for base_addrarea.area_state
     *
     * @mbg.generated
     */
    public void setAreaState(String areaState) {
        this.areaState = areaState == null ? null : areaState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.pinyin
     *
     * @return the value of base_addrarea.pinyin
     *
     * @mbg.generated
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.pinyin
     *
     * @param pinyin the value for base_addrarea.pinyin
     *
     * @mbg.generated
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.pinyin_sh
     *
     * @return the value of base_addrarea.pinyin_sh
     *
     * @mbg.generated
     */
    public String getPinyinSh() {
        return pinyinSh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.pinyin_sh
     *
     * @param pinyinSh the value for base_addrarea.pinyin_sh
     *
     * @mbg.generated
     */
    public void setPinyinSh(String pinyinSh) {
        this.pinyinSh = pinyinSh == null ? null : pinyinSh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.tel_head
     *
     * @return the value of base_addrarea.tel_head
     *
     * @mbg.generated
     */
    public String getTelHead() {
        return telHead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.tel_head
     *
     * @param telHead the value for base_addrarea.tel_head
     *
     * @mbg.generated
     */
    public void setTelHead(String telHead) {
        this.telHead = telHead == null ? null : telHead.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.zip_code
     *
     * @return the value of base_addrarea.zip_code
     *
     * @mbg.generated
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.zip_code
     *
     * @param zipCode the value for base_addrarea.zip_code
     *
     * @mbg.generated
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.area_desc
     *
     * @return the value of base_addrarea.area_desc
     *
     * @mbg.generated
     */
    public String getAreaDesc() {
        return areaDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.area_desc
     *
     * @param areaDesc the value for base_addrarea.area_desc
     *
     * @mbg.generated
     */
    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc == null ? null : areaDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.creator
     *
     * @return the value of base_addrarea.creator
     *
     * @mbg.generated
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.creator
     *
     * @param creator the value for base_addrarea.creator
     *
     * @mbg.generated
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.modifier
     *
     * @return the value of base_addrarea.modifier
     *
     * @mbg.generated
     */
    public Integer getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.modifier
     *
     * @param modifier the value for base_addrarea.modifier
     *
     * @mbg.generated
     */
    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.create_time
     *
     * @return the value of base_addrarea.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.create_time
     *
     * @param createTime the value for base_addrarea.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_addrarea.modify_time
     *
     * @return the value of base_addrarea.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_addrarea.modify_time
     *
     * @param modifyTime the value for base_addrarea.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_addrarea
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BaseAddrarea other = (BaseAddrarea) that;
        return (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getAreaName() == null ? other.getAreaName() == null : this.getAreaName().equals(other.getAreaName()))
            && (this.getAreaType() == null ? other.getAreaType() == null : this.getAreaType().equals(other.getAreaType()))
            && (this.getShortName() == null ? other.getShortName() == null : this.getShortName().equals(other.getShortName()))
            && (this.getEnglishName() == null ? other.getEnglishName() == null : this.getEnglishName().equals(other.getEnglishName()))
            && (this.getAreaLevel() == null ? other.getAreaLevel() == null : this.getAreaLevel().equals(other.getAreaLevel()))
            && (this.getPareaId() == null ? other.getPareaId() == null : this.getPareaId().equals(other.getPareaId()))
            && (this.getPareaCode() == null ? other.getPareaCode() == null : this.getPareaCode().equals(other.getPareaCode()))
            && (this.getAreaState() == null ? other.getAreaState() == null : this.getAreaState().equals(other.getAreaState()))
            && (this.getPinyin() == null ? other.getPinyin() == null : this.getPinyin().equals(other.getPinyin()))
            && (this.getPinyinSh() == null ? other.getPinyinSh() == null : this.getPinyinSh().equals(other.getPinyinSh()))
            && (this.getTelHead() == null ? other.getTelHead() == null : this.getTelHead().equals(other.getTelHead()))
            && (this.getZipCode() == null ? other.getZipCode() == null : this.getZipCode().equals(other.getZipCode()))
            && (this.getAreaDesc() == null ? other.getAreaDesc() == null : this.getAreaDesc().equals(other.getAreaDesc()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_addrarea
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getAreaName() == null) ? 0 : getAreaName().hashCode());
        result = prime * result + ((getAreaType() == null) ? 0 : getAreaType().hashCode());
        result = prime * result + ((getShortName() == null) ? 0 : getShortName().hashCode());
        result = prime * result + ((getEnglishName() == null) ? 0 : getEnglishName().hashCode());
        result = prime * result + ((getAreaLevel() == null) ? 0 : getAreaLevel().hashCode());
        result = prime * result + ((getPareaId() == null) ? 0 : getPareaId().hashCode());
        result = prime * result + ((getPareaCode() == null) ? 0 : getPareaCode().hashCode());
        result = prime * result + ((getAreaState() == null) ? 0 : getAreaState().hashCode());
        result = prime * result + ((getPinyin() == null) ? 0 : getPinyin().hashCode());
        result = prime * result + ((getPinyinSh() == null) ? 0 : getPinyinSh().hashCode());
        result = prime * result + ((getTelHead() == null) ? 0 : getTelHead().hashCode());
        result = prime * result + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        result = prime * result + ((getAreaDesc() == null) ? 0 : getAreaDesc().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_addrarea
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", areaId=").append(areaId);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", areaName=").append(areaName);
        sb.append(", areaType=").append(areaType);
        sb.append(", shortName=").append(shortName);
        sb.append(", englishName=").append(englishName);
        sb.append(", areaLevel=").append(areaLevel);
        sb.append(", pareaId=").append(pareaId);
        sb.append(", pareaCode=").append(pareaCode);
        sb.append(", areaState=").append(areaState);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", pinyinSh=").append(pinyinSh);
        sb.append(", telHead=").append(telHead);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", areaDesc=").append(areaDesc);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}