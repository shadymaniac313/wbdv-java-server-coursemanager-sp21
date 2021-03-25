package com.example.javaservercoursemanager.services;

import com.example.javaservercoursemanager.models.Widget;
import com.example.javaservercoursemanager.repositories.WidgetRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WidgetService {

  @Autowired
  private WidgetRepository repository;

//  private List<Widget> widgets = new ArrayList<>();
//
//  {
//    Widget placeholderWidget = new Widget(123l, "ABC123", "HEADING", 1, "Welcome to Widgets");
//    Widget mainTitle = new Widget(Long.parseLong("1616490328369"), "6058e8c5d0251e0017944156",
//      "HEADING",
//      1, "Welcome to NodeJS!");
//    Widget mainTitleDescription = new Widget(Long.parseLong("1616490353516"),
//      "6058e8c5d0251e0017944156",
//      "PARAGRAPH", 1,
//      "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia, molestiae quas "
//        + "vel sint commodi repudiandae consequuntur voluptatum laborum numquam blanditiis harum "
//        + "quisquam eius sed odit fugiat iusto fuga praesentium optio, eaque rerum! Provident "
//        + "similique accusantium nemo autem. Veritatis obcaecati tenetur iure eius earum ut "
//        + "molestias architecto voluptate aliquam nihil, eveniet aliquid culpa officia aut! "
//        + "Impedit sit sunt quaerat, odit, tenetur error, harum nesciunt ipsum debitis quas "
//        + "aliquid. Reprehenderit, quia. Quo neque error repudiandae fuga? Ipsa laudantium "
//        + "molestias eos  sapiente officiis modi at sunt excepturi expedita sint?");
//    Widget sectionHeading = new Widget(Long.parseLong("1616490386292"),
//    "6058e8c5d0251e0017944156",
//      "HEADING"
//      , 1, "Section 1");
//    Widget sectionDescription = new Widget(Long.parseLong("1616490402243"),
//      "6058e8c5d0251e0017944156",
//      "PARAGRAPH", 1,
//      "Sed quibusdam recusandae alias error harum maxime adipisci amet laborum. Perspiciatis  "
//        + "minima nesciunt dolorem! Officiis iure rerum voluptates a cumque velit  quibusdam sed "
//        + "amet tempora. Sit laborum ab, eius fugit doloribus tenetur  fugiat, temporibus enim "
//        + "commodi iusto libero magni deleniti quod quam  consequuntur! Commodi minima excepturi "
//        + "repudiandae velit hic maxime doloremque. Quaerat provident commodi consectetur veniam "
//        + "similique ad  earum omnis ipsum saepe, voluptas, hic voluptates pariatur est explicabo"
//        + "  fugiat, dolorum eligendi quam cupiditate excepturi mollitia maiores labore  suscipit"
//        + " quas? Nulla, placeat.");
//    this.widgets.add(placeholderWidget);
//    this.widgets.add(mainTitle);
//    this.widgets.add(mainTitleDescription);
//    this.widgets.add(sectionHeading);
//    this.widgets.add(sectionDescription);
//  }

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
    repository.save(toBeEdited);
    return 1;
  }

  public int deleteWidget(Long id) {
    repository.deleteById(id);
    return 1;
  }

}
