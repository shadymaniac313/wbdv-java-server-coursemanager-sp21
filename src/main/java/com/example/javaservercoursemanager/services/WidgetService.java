package com.example.javaservercoursemanager.services;

import com.example.javaservercoursemanager.models.Widget;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class WidgetService {

  private List<Widget> widgets = new ArrayList<>();

  {
    Widget w1 = new Widget(123l, "ABC123", "HEADING", 1, "Welcome to Widgets");
    this.widgets.add(w1);
  }

  public Widget createWidget(String topicId, Widget widget) {
    Long id = (new Date()).getTime();
    widget.setId(id);
    widget.setTopicId(topicId);
    this.widgets.add(widget);
    return widget;
  }

  public List<Widget> findAllWidgets() {
    return widgets;
  }

  public List<Widget> findWidgetsForTopic(String topicId) {
    return widgets.stream().filter(widget -> widget.getTopicId().equals(topicId))
      .collect(Collectors.toList());
  }

  public Widget findWidgetById(Long id) {
    for (Widget w : widgets) {
      if (w.getId().equals(id)) {
        return w;
      }
    }
    return null;
  }

  public int updateWidget(Long id, Widget updatedWidget) {
//    System.out.println(updatedWidget.toString());
    for (int i = 0; i < this.widgets.size(); i++) {
      Widget widget = widgets.get(i);
      if (widget.getId().equals(id)) {
        this.widgets.set(i, updatedWidget);
        return 1;
      }
    }
    return -1;
  }

  public int deleteWidget(Long id) {
    int index = -1;
    for (int i = 0; i < widgets.size(); i++) {
      Widget w = widgets.get(i);
      if (w.getId().equals(id)) {
        index = i;
      }
    }
    if (index >= 0) {
      widgets.remove(index);
      return 1;
    }
    return -1;
  }

}
