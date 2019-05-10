package com.qingqing.live.mybatis.live;

import com.qingqing.live.domain.live.LiveOrderCourseSurvey;
import java.util.List;

public interface LiveOrderCourseSurveyMapper {
    int insert(LiveOrderCourseSurvey record);

    LiveOrderCourseSurvey selectByPrimaryKey(Long id);

    List<LiveOrderCourseSurvey> selectAll();
}