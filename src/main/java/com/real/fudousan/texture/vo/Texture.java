package com.real.fudousan.texture.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.real.fudousan.member.vo.Member;
import com.real.fudousan.room.vo.Room;
import com.real.fudousan.roomwall.vo.RoomWall;

/**
 * 텍스쳐 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Texture implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** TEXTURE_ID. */
	private Integer textureId;

	/** 텍스쳐 분류. */
	private TextureType textureType;

	/** 회원 아이디. */
	private int memberId;

	/** NAME. */
	private String name;

	/** TEXT. */
	private String text;

	/** FILE. */
	private String file;

	/** DATE. */
	private Date creDate;

	/** DEL_DATE. */
	private Date delDate;

	public Texture() {
		super();
	}

	public Texture(Integer textureId, TextureType textureType, int memberId, String name, String text, String file,
			Date creDate, Date delDate) {
		super();
		this.textureId = textureId;
		this.textureType = textureType;
		this.memberId = memberId;
		this.name = name;
		this.text = text;
		this.file = file;
		this.creDate = creDate;
		this.delDate = delDate;
	}

	public Integer getTextureId() {
		return textureId;
	}

	public void setTextureId(Integer textureId) {
		this.textureId = textureId;
	}

	public TextureType getTextureType() {
		return textureType;
	}

	public void setTextureType(TextureType textureType) {
		this.textureType = textureType;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Date getCreDate() {
		return creDate;
	}

	public void setCreDate(Date creDate) {
		this.creDate = creDate;
	}

	public Date getDelDate() {
		return delDate;
	}

	public void setDelDate(Date delDate) {
		this.delDate = delDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Texture [textureId=" + textureId + ", textureType=" + textureType + ", memberId=" + memberId + ", name="
				+ name + ", text=" + text + ", file=" + file + ", creDate=" + creDate + ", delDate=" + delDate + "]";
	}

	

	
}
