package com.example.javaservercoursemanager.services;

import com.example.javaservercoursemanager.models.Widget;
import com.example.javaservercoursemanager.repositories.WidgetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WidgetService {

  @Autowired
  private WidgetRepository repository;

  public Widget createWidget(String topicId, Widget widget) {
    widget.setTopicId(topicId);
    return repository.save(widget);
  }

  public List<Widget> findAllWidgets() {
    return repository.findAllWidgets();
  }

  public List<Widget> findWidgetsForTopic(String topicId) {
    return repository.findWidgetsForTopic(topicId);
  }

  public Widget findWidgetById(Long id) {
    return repository.findWidgetById(id);
  }

  public int updateWidget(Long id, Widget updatedWidget) {
    Widget toBeEdited = repository.findWidgetById(id);
    toBeEdited.setText(updatedWidget.getText());
    toBeEdited.setType(updatedWidget.getType());
    toBeEdited.setSize(updatedWidget.getSize());
    toBeEdited.setWidth(updatedWidget.getWidth());
    toBeEdited.setHeight(updatedWidget.getHeight());
    toBeEdited.setUrl(updatedWidget.getUrl());
    toBeEdited.setWidgetOrder(updatedWidget.getWidgetOrder());
    toBeEdited.setValue(updatedWidget.getValue());
    repository.save(toBeEdited);
    return 1;
  }

  public int deleteWidget(Long id) {
    repository.deleteById(id);
    return 1;
  }

}
