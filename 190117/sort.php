<?php
/**
 * Created by PhpStorm.
 * User: xiangchunlin
 * Date: 2019-01-17
 * Time: 09:55
 */
namespace NoteBook190117;

class Sort{
  public $arr;

  public function __construct(array $arr) {
    $this->arr = $arr;
  }

  public function getArr(){
    return $this->arr;
  }

  /**
   * 冒泡排序
   * @return array
   */
  public function bubbleSort():void {
    $tag = true;
    $len = count($this->arr);
    while ($tag){
      $tag = false;
      for ($i = 0;$i < $len-1;$i++){
        if ($this->arr[$i] > $this->arr[$i+1]){
          list($this->arr[$i],$this->arr[$i+1]) = [$this->arr[$i+1],$this->arr[$i]];
          $tag = true;
        }
      }
    }
  }

}

$arr = [10,1,98,78,45,24,33,21,76,11];
$sort = new Sort($arr);
$sort->bubbleSort();
print_r($sort->getArr());


