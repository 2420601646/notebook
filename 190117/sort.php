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

  /**
   *选择排序
   */
  public function selectSort():void {
    $len = count($this->arr);
    for ($i = 0;$i < $len;$i++){
      $min = $i;
      for ($j = $i+1;$j < $len;$j++){
        if ($this->arr[$min] > $this->arr[$j]){
          list($this->arr[$min],$this->arr[$j]) = [$this->arr[$j],$this->arr[$min]];
        }
      }
    }
  }

}

$arr = [10,1,98,78,45,24,33,21,76,11];
$sort = new Sort($arr);
$sort->selectSort();
print_r($sort->getArr());


