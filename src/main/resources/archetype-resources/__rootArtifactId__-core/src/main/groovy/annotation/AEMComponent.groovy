package ${package}.annotation;

import groovy.transform.AnnotationCollector
import com.citytechinc.cq.component.annotations.Component

import org.apache.sling.api.resource.Resource
import org.apache.sling.models.annotations.Model

@AnnotationCollector
@Component("")
@Model(adaptables = Resource.class)
@interface AEMComponent{
}
