/**
 * Copyright (c) 2018-2028, Chill Zhuang 庄骞 (smallchill@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sailmi.cms.service;

import com.sailmi.cms.entity.Type;
import com.sailmi.cms.utils.TreeEntity;
import com.sailmi.cms.vo.TypeVO;
import com.sailmi.core.mp.base.BaseService;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * 内容分类 服务类
 *
 * @author sailmi
 * @since 2020-12-16
 */
public interface ITypeService extends BaseService<Type> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param type
	 * @return
	 */
	IPage<TypeVO> selectTypePage(IPage<TypeVO> page, TypeVO type);

	/**
	 * 下载中心 下载分类树
	 */
	List<TreeEntity> downTypeTree();

	/**
	 * 下载中心 下载分类树
	 */
	List<TreeEntity> tree();

	/**
	 * 下载中心 下载分类树
	 */
	List<TreeEntity> knowledgeTree();

}
