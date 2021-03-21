package com.example.javaservercoursemanager.controllers;

import com.example.javaservercoursemanager.models.Widget;
import com.example.javaservercoursemanager.services.WidgetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {

  @Autowired
  WidgetService service;

  @PostMapping("/api/topics/{topicId}/widgets")
  public Widget createWidget(@PathVariable("topicId") String topicId, @RequestBody Widget widget) {
    widget.setTopicId(topicId);
    return service.createWidget(topicId, widget);
  }

  @GetMapping("/api/topics/{topicId}/widgets")
  public List<Widget> findWidgetsForTopic(@PathVariable("topicId") String topicId) {
    return service.findWidgetsForTopic(topicId);
  }

  @PutMapping("api/widgets/{widgetId}")
  public int updateWidget(@PathVariable("widgetId") Long widgetId, @RequestBody Widget widget) {
    return service.updateWidget(widgetId, widget);
  }

  @DeleteMapping("/api/widgets/{widgetId}")
  public int deleteWidget(@PathVariable("widgetId") Long widgetId) {
    return service.deleteWidget(widgetId);
  }

  @GetMapping("/api/widgets")
  public List<Widget> findAllWidgets() {
    return service.findAllWidgets();
  }

  @GetMapping("/api/widgets/{widgetId}")
  public Widget findWidgetById(@PathVariable("widgetId") Long widgetId) {
    return service.findWidgetById(widgetId);
  }

}
