package com.shanzhu.oe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 试卷
 *
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaperManage {

    /**
     * 试卷id
     */
    private Integer paperId;

    /**
     * 题目类型
     */
    private Integer questionType;

    /**
     * 题目编号
     */
    private Integer questionId;

}