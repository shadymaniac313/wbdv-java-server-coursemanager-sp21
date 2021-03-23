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
    Widget w2 = new Widget(Long.parseLong("1616490328369"), "6058e8c5d0251e0017944156", "HEADING",
      1, "Welcome to NodeJS!");
    Widget w3 = new Widget(Long.parseLong("1616490353516"), "6058e8c5d0251e0017944156",
      "PARAGRAPH", 1,
      "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia, molestiae quas "
        + "vel sint commodi repudiandae consequuntur voluptatum laborum numquam blanditiis harum "
        + "quisquam eius sed odit fugiat iusto fuga praesentium optio, eaque rerum! Provident "
        + "similique accusantium nemo autem. Veritatis obcaecati tenetur iure eius earum ut "
        + "molestias architecto voluptate aliquam nihil, eveniet aliquid culpa officia aut! "
        + "Impedit sit sunt quaerat, odit, tenetur error, harum nesciunt ipsum debitis quas "
        + "aliquid. Reprehenderit, quia. Quo neque error repudiandae fuga? Ipsa laudantium "
        + "molestias eos  sapiente officiis modi at sunt excepturi expedita sint?");
    Widget w4 = new Widget(Long.parseLong("1616490386292"), "6058e8c5d0251e0017944156", "HEADING"
      , 1, "Section 1");
    Widget w5 = new Widget(Long.parseLong("1616490402243"), "6058e8c5d0251e0017944156",
      "PARAGRAPH", 1,
      "Sed quibusdam recusandae alias error harum maxime adipisci amet laborum. Perspiciatis  "
        + "minima nesciunt dolorem! Officiis iure rerum voluptates a cumque velit  quibusdam sed "
        + "amet tempora. Sit laborum ab, eius fugit doloribus tenetur  fugiat, temporibus enim "
        + "commodi iusto libero magni deleniti quod quam  consequuntur! Commodi minima excepturi "
        + "repudiandae velit hic maxime doloremque. Quaerat provident commodi consectetur veniam "
        + "similique ad  earum omnis ipsum saepe, voluptas, hic voluptates pariatur est explicabo"
        + "  fugiat, dolorum eligendi quam cupiditate excepturi mollitia maiores labore  suscipit"
        + " quas? Nulla, placeat.");
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
