package com.example.javaservercoursemanager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "widgets")
public class Widget {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String type;
  private String topicId;
  private Integer widgetOrder;
  private String text;
  private String url;
  private Integer size;
  private Integer width;
  private Integer height;
  private String cssClass;
  private String style;
  private String value;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTopicId() {
    return topicId;
  }


  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }

  public Integer getWidgetOrder() {
    return widgetOrder;
  }

  public void setWidgetOrder(Integer widgetOrder) {
    this.widgetOrder = widgetOrder;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public String getCssClass() {
    return cssClass;
  }

  public void setCssClass(String cssClass) {
    this.cssClass = cssClass;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Widget() {
    this.id = new Long(-1);
  }

  public Widget(String name, Long id, String type, String topicId, Integer widgetOrder, String text,
    String url, Integer size, Integer width, Integer height, String cssClass, String style,
    String value) {
    this.name = name;
    this.id = id;
    this.type = type;
    this.topicId = topicId;
    this.widgetOrder = widgetOrder;
    this.text = text;
    this.url = url;
    this.size = size;
    this.width = width;
    this.height = height;
    this.cssClass = cssClass;
    this.style = style;
    this.value = value;
  }

  public Widget(Long id, String topicId, String type, Integer size, String text, int width,
    int height, String url, Integer widgetOrder) {
    this.id = id;
    this.topicId = topicId;
    this.type = type;
    this.size = size;
    this.text = text;
    this.height = height;
    this.width = width;
    this.url = url;
    this.widgetOrder = widgetOrder;
  }

  public Widget(Long id, String topicId, String type, Integer size, String text) {
    this.id = id;
    this.topicId = topicId;
    this.type = type;
    this.size = size;
    this.text = text;
  }

  public Widget(Widget copy) {
    this.setId(copy.getId());
    this.setTopicId(copy.getTopicId());
    this.setText(copy.getText());
    this.setCssClass(copy.getCssClass());
    this.setHeight(copy.getHeight());
    this.setName(copy.getName());
    this.setSize(copy.getSize());
    this.setStyle(copy.getStyle());
    this.setUrl(copy.getUrl());
    this.setType(copy.getType());
    this.setValue(copy.getValue());
    this.setWidgetOrder(copy.getWidgetOrder());
    this.setWidth(copy.getWidth());
  }

  @Override
  public String toString() {
    return "Widget{" +
      "name='" + name + '\'' +
      ", id=" + id +
      ", type='" + type + '\'' +
      ", topicId='" + topicId + '\'' +
      ", widgetOrder=" + widgetOrder +
      ", text='" + text + '\'' +
      ", url='" + url + '\'' +
      ", size=" + size +
      ", width=" + width +
      ", height=" + height +
      ", cssClass='" + cssClass + '\'' +
      ", style='" + style + '\'' +
      ", value='" + value + '\'' +
      '}';
  }
}
