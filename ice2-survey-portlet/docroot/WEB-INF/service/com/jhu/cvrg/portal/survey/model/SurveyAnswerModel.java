/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.jhu.cvrg.portal.survey.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the SurveyAnswer service. Represents a row in the &quot;JHU_SurveyAnswer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.jhu.cvrg.portal.survey.model.impl.SurveyAnswerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.jhu.cvrg.portal.survey.model.impl.SurveyAnswerImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a survey answer model instance should use the {@link SurveyAnswer} interface instead.
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyAnswer
 * @see com.jhu.cvrg.portal.survey.model.impl.SurveyAnswerImpl
 * @see com.jhu.cvrg.portal.survey.model.impl.SurveyAnswerModelImpl
 * @generated
 */
public interface SurveyAnswerModel extends BaseModel<SurveyAnswer> {
	/**
	 * Gets the primary key of this survey answer.
	 *
	 * @return the primary key of this survey answer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this survey answer
	 *
	 * @param pk the primary key of this survey answer
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the survey answer id of this survey answer.
	 *
	 * @return the survey answer id of this survey answer
	 */
	public long getSurveyAnswerId();

	/**
	 * Sets the survey answer id of this survey answer.
	 *
	 * @param surveyAnswerId the survey answer id of this survey answer
	 */
	public void setSurveyAnswerId(long surveyAnswerId);

	/**
	 * Gets the survey question id of this survey answer.
	 *
	 * @return the survey question id of this survey answer
	 */
	public long getSurveyQuestionId();

	/**
	 * Sets the survey question id of this survey answer.
	 *
	 * @param surveyQuestionId the survey question id of this survey answer
	 */
	public void setSurveyQuestionId(long surveyQuestionId);

	/**
	 * Gets the survey id of this survey answer.
	 *
	 * @return the survey id of this survey answer
	 */
	public long getSurveyId();

	/**
	 * Sets the survey id of this survey answer.
	 *
	 * @param surveyId the survey id of this survey answer
	 */
	public void setSurveyId(long surveyId);

	/**
	 * Gets the user id of this survey answer.
	 *
	 * @return the user id of this survey answer
	 */
	public long getUserId();

	/**
	 * Sets the user id of this survey answer.
	 *
	 * @param userId the user id of this survey answer
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this survey answer.
	 *
	 * @return the user uuid of this survey answer
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this survey answer.
	 *
	 * @param userUuid the user uuid of this survey answer
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the answer of this survey answer.
	 *
	 * @return the answer of this survey answer
	 */
	@AutoEscape
	public String getAnswer();

	/**
	 * Sets the answer of this survey answer.
	 *
	 * @param answer the answer of this survey answer
	 */
	public void setAnswer(String answer);

	/**
	 * Gets a copy of this survey answer as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public SurveyAnswer toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(SurveyAnswer surveyAnswer);

	public int hashCode();

	public String toString();

	public String toXmlString();
}